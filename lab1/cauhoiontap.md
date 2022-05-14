1. Trong quá trình tạo dự án Spring Boot chúng ta phải khai báo những tham số sau đây : groupID, artifactID. Ý nghĩa các tham số này là gì?
   - GroupId là một thành phần XML trong tệp POM.XML của dự án Maven chỉ định id của nhóm dự án
   - artifactID là một thành phần XML trong POM.XML của dự án Maven chỉ định id của dự án
2. Tại sao phải đảo ngược tên miền trong <groupId>vn.techmaster</groupId>?
     
3. SpringBoot có 2 cơ chế để quản lý thư viện. Hãy kể tên chúng?
4. File pom.xml có tác dụng gì?
   File pom.xml là nơi khai báo tất cả những gì liên quan đến dự án được cấu hình qua maven, như khai báo các dependency, version của dự án, tên dự án, repossitory
   cấu trúc các cấu hình ban đầu của toàn bộ project
5. Trong file pom.xml có các thẻ dependency. Ý nghĩa của chúng là gì?
   Dùng đẻ khai báo các thư viện với các thông tin bao gồm tên thư viện và version của thư viện.
   <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
   </dependency>

6. Ý nghĩa của @Controller là gì?
   Là một annotation có thể trả về View qua một String hoặc JSON data trong response body (nếu được chỉ định). Thích hợp cho các controller có routing, chuyển trang các kiểu.
7. Ý nghĩa của @RequestMapping là gì? Nó có những tham số gì ngoài value?
   Là một annotation dùng để đánh dấu lên từng method của controller, để chỉ định rằng khi HTTP method tương ứng gọi tới thì method sẽ được thực thi
   có thể nhận các tham số method, params
8. Ý nghĩa của @RequestBody khi đặt trong hàm hứng request để làm gì?
   Thông báo cho người dùng biết rằng APIở controller, sẽ trả về một đối tượng Object kiểu Json cho client chứ không render ra một trang view
9. Hãy trả lời khi nào thì dùng @PathVariable và khi nào nên dùng @RequestParam
   @RequestParam được dùng để trích xuất dữ liệu từ request query.
   @PathVariable thì được dùng để trích xuất dữ liệu từ URL path.
10. Thứ tự các thành phần đường dẫn @PathVariable có thể hoán đổi được không?
   không
11. @GetMapping khác gì so với @PostMapping?
   
12. Trong các annotation @RequestMapping, @GetMapping, @PostMapping… có tham số produces = MediaType.XXXX ý nghĩa tham số này là gì?
13. Giải thích ý nghĩa của @RequestBody trong đoạn code dưới đây
@PostMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public Message echoMessage(@RequestBody Message message){
return message;
trả về một đối tượng Object message kiểu Json cho client.

14. Cổng mặc định ứng dụng SpringBoot là 8080. Hãy google cách để thay đổi cổng lắng nghe mặc định
    Đổi port với Property file
    Java Config
