public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        // Call 1
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException | WrongCurrencyException | WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        // Call 2
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException | WrongCurrencyException | WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        // Call 3
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException | WrongCurrencyException | WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        // Call 4
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException | WrongCurrencyException | WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        // Call 5
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException | WrongCurrencyException | WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}
