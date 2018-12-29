package ru.itpark;

public class CashbackService {
    int cashBack(int sumCategorySimple, int sumCategoryPriority, int sumCategorySuper) {

        int resultCategorySimple = 0;
        int resultCategoryPriority = 0;
        int resultCategorySuper = 0;
        int categoryPriorityPersent = 5;
        int categorySuperPersent = 30;
        int resultLimit = 3000;

        int resultCommon = (sumCategorySimple / 100) + ((sumCategoryPriority * categoryPriorityPersent) / 100) + ((sumCategorySuper * categorySuperPersent) / 100);
        if (resultCommon < resultLimit) {
            return resultCommon;
        } else {

            return resultLimit;
        }

    }
}

