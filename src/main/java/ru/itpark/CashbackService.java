package ru.itpark;

class CashbackService {
    int cashBack(int sumCategorySimple, int sumCategoryPriority, int sumCategorySuper) {


        int categoryPriorityPersent = 5;
        int categorySuperPersent = 30;
        int resultLimit = 3000;

        int resultCommon = (sumCategorySimple / 100) + (sumCategoryPriority * categoryPriorityPersent / 100) + (sumCategorySuper * categorySuperPersent / 100);
        if (resultCommon < resultLimit) {
            return resultCommon;
        } else {

            return resultLimit;
        }

    }
}

