<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse; /* Removes extra space between borders */
    }
    td {
        padding: 8px; /* Increase padding for better spacing */
        vertical-align: middle; /* Align items vertically */
    }
    .form-label {
        text-align: right; /* Align labels to the right */
        padding-right: 15px; /* Increase space between label and select */
    }
    .form-select {
        width: 150px; /* Adjust width as needed */
        margin-left: 10px; /* Add space between label and select */
    }
    .center {
        text-align: center; /* Center-align text and elements */
    }
    .submit-button {
        text-align: center; /* Center-align button in the table cell */
    }
</style>

</head>
<body>
    <h1>Student Form</h1>


    <form:form method="post" action="submit" modelAttribute="humans">
        <table>
            <tr>
                <td class="form-label">Plan Name:</td>
                <td>
                    <form:select path="planName" class="form-select">
                        <form:option value="" label="Select plan" />
                        <form:options items="${plan}" />
                    </form:select>
                </td>

                <td class="form-label">Plan Status:</td>
                <td>
                    <form:select path="status" class="form-select">
                        <form:option value="" label="Select status" />
                        <form:options items="${status}" />
                    </form:select>
                </td>

                <td class="form-label">Gender:</td>
                <td>
                    <form:select path="gender" class="form-select">
                        <form:option value="" label="Select gender" />
                        <form:option value="Male" label="Male" />
                        <form:option value="Female" label="Female" />
                    </form:select>
                </td>
            </tr>

            <tr>
                <td colspan="6" class="submit-button">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>

    <p>
        <font color='blue'>${msg}</font>
    </p>
      <h2>Data List</h2>
        <table class="list-table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Status</th>
                    <th>Gender</th>
                    <th>Plan Name</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${dataList}" var="data">
                    <tr>
                        <td>${data.id}</td>
                        <td>${data.status}</td>
                        <td>${data.gender}</td>
                        <td>${data.planName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>
