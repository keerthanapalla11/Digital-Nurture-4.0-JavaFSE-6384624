package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest2{

    @Test
    public void testVerifyInteraction() {
        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service with mock
        MyService service = new MyService(mockApi);

        // Call service method
        service.fetchData();

        // Verify that getData() was called once on mockApi
        verify(mockApi).getData();
    }
}
