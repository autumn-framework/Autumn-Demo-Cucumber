package com.autumnImp.demo.validators.apiStatus;

import java.text.MessageFormat;

public class GetUserStatus {

    public enum UserGetParams implements ValidationInterface {

        SUCCESS_200(200, null, null, null),
        SUCCESS_201(201, null, null, null);


        private int httpResponseCode;
        private String errorCode;
        private String errorMessages;
        private String message;

        UserGetParams(int httpResponseCode, String errorCode, String errorMessages, String message) {
            this.httpResponseCode = httpResponseCode;
            this.errorCode = errorCode;
            this.errorMessages = errorMessages;
            this.message = message;
        }

        public int getHttpResponseCode() {
            return httpResponseCode;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMessages() {
            return errorMessages;
        }

        /**
         * @description-Usedforaddingdynamicvalueinerrormessage
         * @params
         */
        public void setArgumentInErrorMessages(String... s) {
            String finalMessage = MessageFormat.format(this.errorMessages, s);
            this.errorMessages = finalMessage;
        }

        /**
         * @description-Usedforremovingaddeddynamicvalueinerrormessage
         * @params
         */
        public void resetArgumentInErrorMessages(String... s) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null) {
                    this.errorMessages = this.errorMessages.replace("null", "{" + i + "}");
                } else {
                    this.errorMessages = this.errorMessages.replace(s[i], "{" + i + "}");
                }
            }
        }

        public String getMessage() {
            return message;
        }

    }

}
