public class BankApplication {
    private final List<Account> accounts = new ArrayList<>() {{
        add(new Account("accountId001", 100, "USD"));
        add(new Account("accountId002", 500, "EUR"));
        add(new Account("accountId003", 250, "HRV"));
        add(new Account("accountId004", 1000, "USD"));
        add(new Account("accountId005", 750, "USD"));
        add(new Account("accountId006", 50, "USD"));
    }};

    public void process(String accountId, int amount, String currency) throws Exception {
        Account desiredAccount = accounts.stream()
                .filter(account -> account.getId().equals(accountId))
                .findAny()
                .orElseThrow(WrongAccountException::new);

        if (!desiredAccount.getCurrency().equals(currency)) {
            throw new WrongCurrencyException();
        }

        if (desiredAccount.getBalance() < amount) {
            throw new WrongOperationException();
        }

        int randomInt = new Random().nextInt(2);
        if (randomInt == 1) {
            throw new Exception("Сталася помилка при процесінгу, спробуйте ще раз");
        }

        desiredAccount.setBalance(desiredAccount.getBalance() - amount);
    }