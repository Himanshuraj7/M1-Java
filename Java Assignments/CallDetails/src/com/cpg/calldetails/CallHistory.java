package com.cpg.calldetails;

import java.util.List;
import java.util.ArrayList;

public class CallHistory {

private List<Call> callList=new ArrayList<Call>();

public List<Call> getCallList() {
	return callList;
}
public void setCallList(List<Call> callList) {
	this.callList = callList;
}

public void addCal(Call callObject) {
	callList.add(callObject);
	
}
public float findTotalDuration(long calledNumber) {
	float sum=0;
	for(Call obj : callList ) {
		if(calledNumber==(obj.getCalledNumber()))
			sum=sum+obj.getDuration();
	}
	return sum;
	
}
}