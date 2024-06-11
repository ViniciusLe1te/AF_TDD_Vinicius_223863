public class LoginScreen {

    /**
     * Realiza o login com o nome de usuário e senha fornecidos.
     * 
     * @param username o nome de usuário
     * @param password a senha
     * @return true se as credenciais são válidas, false caso contrário
     */
    public boolean login(String username, String password) {
        // Verifica se o nome de usuário é nulo ou vazio
        if (username == null || username.isEmpty()) {
            return false;
        }
        
        // Verifica se a senha é nula ou vazia
        if (password == null || password.isEmpty()) {
            return false;
        }
        
        // Verifica as credenciais (para fins de exemplo, usamos credenciais fixas)
        return "validUser".equals(username) && "validPass".equals(password);
    }
}
