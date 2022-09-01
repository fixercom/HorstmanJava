package chapter_12_1;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;

    /**
     * Конструирует объект банка
     *
     * @param n              Количество счетов
     * @param initialBalance Первоначальный остаток на каждом счете
     */
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    /**
     * Переводит деньги с одного счета на другой
     * @param from Счет, с которого переводятся деньги
     * @param to Счет, на который переводят деньги
     * @param amount Сумма перевода
     * */

    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) {
            return;
        }
        System.out.print(Thread.currentThread().getName());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.print(Arrays.toString(accounts));
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }

    /**
     * Получает сумму остатков на всех счетах
     * @return Возвращает общий баланс
     * */
    public double getTotalBalance() {
        double sum = 0;
        for (double account : accounts) {
            sum += account;
        }
        return sum;
    }

    /**
     * Получает количество счетов в банке
     * @return Возвращает колчисество счетов
     * */
    public int size(){
        return accounts.length;
    }
}
