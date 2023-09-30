package com.swe.arrayflatter;

import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RemoteServiceMockTest {

    @Mock
    private RemoteService remoteService;

    @InjectMocks
    private RemoteServiceClient remoteServiceClient;

    @Test
    public   void   testRemoteService() {

    }
}
