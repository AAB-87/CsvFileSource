package ru.netology.bonus;

public class BonusService {
    public long calculate(long amount, boolean registered) {  // метод принимает на вход сумму и данные по регистрации пользователя
        int percent = registered ? 3 : 1; // сокращённое написание условия if else (если пользователь зарегистрирован, то 3%, иначе 1%)
        long bonus = amount * percent / 100 / 100;   // высчитываем бонус в копейках
        long limit = 500;    // устанавливаем лимит на бонус
        if (bonus > limit) {  // если бонус больше лимита
            bonus = limit;   // записываем лимит в бонус
        }
        return bonus;
    }
}