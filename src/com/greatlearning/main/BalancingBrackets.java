package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String args[]) {
		BalancingBrackets brackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])";
		if (brackets.checkIsBalanced(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

	private boolean checkIsBalanced(String string) {
		Stack<Character> stack = new Stack<>();
		boolean isContinue = true;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			switch (c) {
			case '{':
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			case ')':
				if (isContinue(stack, c)) {
					System.out.println("continue checking at index " + i);
				} else {
					isContinue = false;
				}
				break;
			case '}':
				if (isContinue(stack, c)) {
					System.out.println("continue checking at index " + i);
				} else {
					isContinue = false;
				}
				break;
			case ']':
				if (isContinue(stack, c)) {
					System.out.println("continue checking at index " + i);
				} else {
					isContinue = false;
				}
				break;
			}
			if(!isContinue) {
				return false;
			}

		}

		if (stack.isEmpty()) {
			return true;
		}

		return false;
	}

	public boolean isContinue(Stack<Character> stack, char ch) {
		if (stack.isEmpty()) {
			return false;
		}
		if (stack.pop().equals(getOpeningBracket(ch))) {
			return true;
		}
		return false;
	}

	public char getOpeningBracket(char ch) {
		switch (ch) {
		case '}':
			return '{';
		case ']':
			return '[';
		case ')':
			return '(';
		default:
			return 'N';
		}
	}

}
