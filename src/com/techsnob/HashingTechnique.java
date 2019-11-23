public static void main(String[] args) {
        System.out.println(checkPassword("1", hash("1")));
    }

    public static String hash(String inputStr){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(inputStr.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return Base64.encode(md.digest());
    }

    public static boolean checkPassword(String pwdStr, String hashedPwdStr){
        return hash(pwdStr).equals(hashedPwdStr);
    }
