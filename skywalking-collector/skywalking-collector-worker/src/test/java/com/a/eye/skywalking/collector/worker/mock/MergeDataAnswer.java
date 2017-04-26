package com.a.eye.skywalking.collector.worker.mock;

import com.a.eye.skywalking.collector.worker.storage.JoinAndSplitData;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengys5
 */
public class MergeDataAnswer implements Answer<Object> {

    private List<JoinAndSplitData> joinAndSplitDataList = new ArrayList<>();

    @Override
    public Object answer(InvocationOnMock invocation) throws Throwable {
        JoinAndSplitData joinAndSplitData = (JoinAndSplitData)invocation.getArguments()[0];
        joinAndSplitDataList.add(joinAndSplitData);
        return null;
    }

    public List<JoinAndSplitData> getJoinAndSplitDataList() {
        return joinAndSplitDataList;
    }
}
