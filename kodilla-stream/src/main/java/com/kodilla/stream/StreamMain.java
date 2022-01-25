package com.kodilla.stream;

import com.kodilla.stream.beautifier.PeomBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PeomBeautifier poemBeautifier = new PeomBeautifier();

        //1st text beautifier
        String text1 = "Hello friends!";
        PoemDecorator codeToExecute2 = (text) -> "ABC " + text + " ABC";
        poemBeautifier.beautify(text1, codeToExecute2);

        //2nd test beautifier
        String text2 = "Nice to meet you";
        codeToExecute2 = (text) -> text.toUpperCase(Locale.ROOT);
        poemBeautifier.beautify(text2, codeToExecute2);

        //3rd test beautifier
        String text3 = "Welcome to the jungle";
        codeToExecute2 = (text) -> {
            char[] textToCharArray = text.toCharArray();
            text ="";
            for (char c : textToCharArray) {
                text += c;
                text += "*";
            }
            return text;
        };
        poemBeautifier.beautify(text3, codeToExecute2);

        //4rd test beautifier
        String text4 = "We are getting tilted";
        codeToExecute2 = (text) -> {
            char[] textToCharArray = text.toCharArray();
            text ="";
            for (char c : textToCharArray) {

                text += c;
                text += c;
            }
            return text;
        };
        poemBeautifier.beautify(text4, codeToExecute2);
    }
}
