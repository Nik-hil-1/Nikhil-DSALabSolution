package com.greatlearning.lab.question1;

import java.util.Stack;

public class BalancedBracket {

	 boolean isBalanced(String data) {

		if (data.length() % 2 == 1)
			return false;

		else {

			Stack<Character> st = new Stack<>();

			for (int i = 0; i < data.length(); i++) {

				char ch = data.charAt(i);
				
				if (ch == '(' || ch == '{' || ch == '[') {
					st.push(ch);
					continue;
				}

				if(st.isEmpty()) {
					return false;
				}

				else {

					char c = st.pop();

					switch (ch) {

					    case ')': {

						    if (c == '{' || c == '[')
							    return false;
						    break;
					    }
					    case '}': {

						    if (c == '(' || c == '[')
							    return false;
						    break;

					    }
					    case ']': {

						    if (c == '{' || c == '(')
							    return false;
						    break;
					    }

					}
					
					
				}

			}
		
			return true;

		}
		
	}
	 
}