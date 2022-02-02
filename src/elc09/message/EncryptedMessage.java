package elc09.message;

public record EncryptedMessage(String originalMessage, String encryptedMessage) {

    public String getOriginalMessage() {
        return originalMessage;
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public String isEncryptedCorrectly() {
        int originalMessageLetterIndex = 0;
        for (int i = 0; i < getEncryptedMessage().length(); i++) {
            if (getOriginalMessage().charAt(originalMessageLetterIndex) == getEncryptedMessage().charAt(i)) {
                originalMessageLetterIndex++;
            }

            if (originalMessageLetterIndex == getOriginalMessage().length()) {
                return "DA";
            }
        }

        return "NE";
    }
}
