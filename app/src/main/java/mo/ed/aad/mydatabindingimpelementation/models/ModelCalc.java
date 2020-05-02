package mo.ed.aad.mydatabindingimpelementation.models;

import androidx.lifecycle.ViewModel;

public class ModelCalc {
    int NumOne, NumTwo, NumThree;

    public ModelCalc(int numOne, int numTwo, int numThree) {
        NumOne = numOne;
        NumTwo = numTwo;
        NumThree = numThree;
    }

    public int getNumOne() {
        return NumOne;
    }

    public void setNumOne(int numOne) {
        NumOne = numOne;
    }

    public int getNumTwo() {
        return NumTwo;
    }

    public void setNumTwo(int numTwo) {
        NumTwo = numTwo;
    }

    public int getNumThree() {
        return NumThree;
    }

    public void setNumThree(int numThree) {
        NumThree = numThree;
    }
}