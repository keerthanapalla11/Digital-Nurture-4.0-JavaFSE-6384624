package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Mock ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub getData() to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Assert expected result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
