package com.autumnImp.demo.validators;

import com.autumn.reporting.assertions.CustomAssert;
import com.autumnImp.demo.apiRequestBuilder.APIInterface;
import com.autumnImp.demo.exceptions.APIStatusExceptions.ErrorCodeException;
import com.autumnImp.demo.exceptions.APIStatusExceptions.ErrorMessageException;
import com.autumnImp.demo.exceptions.APIStatusExceptions.HttpStatusCodeException;
import com.autumnImp.demo.exceptions.APIStatusExceptions.MessageException;
import com.autumnImp.demo.validators.apiStatus.ValidationInterface;

import java.text.MessageFormat;
import java.util.regex.Pattern;

public class CommonValidation {

    private static volatile CommonValidation instance;

    private CommonValidation() {

    }

    public static CommonValidation getInstance() {
        if (instance == null) {
            synchronized (CommonValidation.class) {
                if (instance == null) {
                    instance = new CommonValidation();
                }
            }
        }
        return instance;
    }

    public void basicAsserts(APIInterface obj, ValidationInterface statusDetails) {
        try {
            CustomAssert.assertEquals(obj.getApiResponse().getStatusCode(),
                    statusDetails.getHttpResponseCode(), "Http Status Code Validation");
        } catch (AssertionError | Exception e) {
            throwAssertionException(obj, (AssertionError) e);
        }

        if (obj.getResponsePojo() != null) {
            try {
                if (obj.getResponsePojo().getErrorCode() != null)
                    CustomAssert.assertEquals(obj.getResponsePojo().getErrorCode().toString(), statusDetails.getErrorCode(), "ErrorCode validation");
            } catch (AssertionError ae) {
                throw new ErrorCodeException(ae);
            }
            try {
                if (obj.getResponsePojo().getErrorMessages() != null) {
                    CustomAssert.assertContains(obj.getResponsePojo().getErrorMessages().toString(),
                            statusDetails.getErrorMessages(), "ErrorMessages Validation");
                }
            } catch (AssertionError ae) {
                throw new ErrorMessageException(ae);
            }
            try {
                if (obj.getResponsePojo().getMessage() != null) {
                    CustomAssert.assertContains(obj.getResponsePojo().getMessage().toString(),
                            statusDetails.getMessage(), "Message Validation");
                }
            } catch (AssertionError ae) {
                throw new MessageException(ae);
            }
        }

    }




    /**
     *
     * @description: this method is used to throw customized exception acc to the error messages
     */


    private void throwAssertionException(APIInterface obj, AssertionError e) {
        String message = null;

        try {
            message = obj.getResponsePojo().getErrorMessages().toString();
        } catch (NullPointerException ex) {
            throw new HttpStatusCodeException(e);
        }

        int StatusCode = obj.getApiResponse().getStatusCode();

        if (Pattern.matches("4..", Integer.toString(StatusCode))) {
            throw new HttpStatusCodeException(message, e);
        } else if (Pattern.matches("5..", Integer.toString(StatusCode))) {
            throw new HttpStatusCodeException(message, e);
        } else {
            throw new HttpStatusCodeException(e);
        }

    }


    public void basicAssertsWoMessage(APIInterface obj, ValidationInterface statusDetails) {
        try {
            CustomAssert.assertEquals(obj.getApiResponse().getStatusCode(),
                    statusDetails.getHttpResponseCode(), "Http Status Code Validation");
        } catch (AssertionError ae) {
            throw new HttpStatusCodeException(ae);
        }
        if (obj.getResponsePojo() != null) {
            try {
                if (obj.getResponsePojo().getErrorCode() != null)
                    CustomAssert.assertEquals(obj.getResponsePojo().getErrorCode().toString(), statusDetails.getErrorCode(), "ErrorCode validation");
            } catch (AssertionError ae) {
                throw new ErrorCodeException(ae);
            }
        }
    }


    /***
     * @description: Use below method for verifying dynamic error message
     * @param obj
     * @param statusDetails
     * @param dynamicValuesOfErrorMessage
     */
    public void basicAsserts(APIInterface obj, ValidationInterface statusDetails, String... dynamicValuesOfErrorMessage) {
        try {
            CustomAssert.assertEquals(obj.getApiResponse().getStatusCode(),
                    statusDetails.getHttpResponseCode(), "Http Status Code Validation");
        } catch (AssertionError ae) {
            throw new HttpStatusCodeException(ae);
        }
        try {
            if (!(obj.getResponsePojo().getErrorCode() == null))
                CustomAssert.assertEquals(obj.getResponsePojo().getErrorCode().toString(), statusDetails.getErrorCode(), "ErrorCode validation");
        } catch (AssertionError ae) {
            throw new ErrorCodeException(ae);
        }
        try {
            String message = statusDetails.getErrorMessages();
            String messageWithDynamicValue = setArgumentInErrorMessages(message, dynamicValuesOfErrorMessage);
            CustomAssert.assertEquals(obj.getResponsePojo().getErrorMessages(), messageWithDynamicValue, "ErrorMessages Validation");
        } catch (AssertionError ae) {
            throw new ErrorMessageException(ae);
        }
        try {
            CustomAssert.assertEquals(obj.getResponsePojo().getMessage(), statusDetails.getMessage(), "Message Validation");
        } catch (AssertionError ae) {
            throw new MessageException(ae);
        }
    }


    public String setArgumentInErrorMessages(String errorMessage, String... s) {
        String finalMessage = MessageFormat.format(errorMessage, s);
        return finalMessage;
    }


}
