package com.hdfc.employeemanagementsystem.restcontroller;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeController.class)
class EmployeeControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private IEmployeeService employeeService;
//
//    @Test
//    void getRatingByCustomerId() throws Exception {
//        Employee employee = new Employee(1,"Ramesh","25/09/2000");
//        when(employeeService.getEmployeeById(1)).thenReturn(employee);
//        mockMvc.perform(get("/employees/getRatingBy/{employeeId}",1)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.employeeName").value("Ramesh"));
//
//
//    }

//    private String mapToJson(Object object) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(object);
//    }
//
//    @Test
//    void getAll() {
//
//    }

}