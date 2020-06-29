package NewRakuten;

import java.util.ArrayList;
import java.util.List;

public class TreeLogic {
	public static void main(String[] args) {
		//Sample Inputs
		int[] input = new int[] {1, 5, 7, 9, 3, 2, 5, 1};
		//int[] input = new int[] {3, 7, 4, 5};
		
		int N = input.length;
		List<String> FirstSequence = new ArrayList<String>();
		List<String> SecondSequence = new ArrayList<String>();
		List<String> OutputSequence = new ArrayList<String>();
		
		FirstSequence = CorrectSequence("H",N);
		SecondSequence = CorrectSequence("L",N);
		
		for(int i=0; i<N-1;i++) {
			if(input[i] > input[i+1]) {
				OutputSequence.add("H");
			}
			else if(input[i] < input[i+1]) {
				OutputSequence.add("L");
			}
			else if(input[i] == input[i+1]) {
				OutputSequence.add("E");
			}
		}
		
		//Final Output calculation
		int firstSeqCount = ChangeCount(OutputSequence, FirstSequence);
		int secondSeqCount = ChangeCount(OutputSequence, SecondSequence);		

		if(firstSeqCount > secondSeqCount) {
			System.out.println("No. of minimum moves:" + secondSeqCount);
		} else {
			System.out.println("No. of minimum moves:" + firstSeqCount);
		}
	}

	public static int ChangeCount(List<String> _outputSeq, List<String> _compSeq) {
		int count = 0;
		
		for(int i=0;i< _compSeq.size();i++) {
			if(_compSeq.get(i) != _outputSeq.get(i)) {
				count += 1;
			}			
		}
		return count;
	}
	
	public static List<String> CorrectSequence(String firstElement,int N)
	{
		List<String> tempSeq = new ArrayList<String>();
		String secondElement = "";
		if(firstElement == "H") {
			secondElement = "L";
		}
		else {
			secondElement = "H";
		}
		
		for(int i=1;i< N;i++) {
			if(i%2 != 0) {
				tempSeq.add(firstElement);
			}
			else {
				tempSeq.add(secondElement);
			}
		}
		return tempSeq;
	}
}
