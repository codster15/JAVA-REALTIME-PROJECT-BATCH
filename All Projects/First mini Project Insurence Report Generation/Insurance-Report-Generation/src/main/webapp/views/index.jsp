<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
    <style>
        table {
            width: 100%;
        }
        td {
            padding: 10px;
        }
        .center {
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Student Form</h1>
    <p>
        <font color='blue'>${msg}</font>
    </p>

    <form:form method="post" action="submit" modelAttribute="humans">
        <table>
            <tr>
                <td>Plan Name:</td>
                <td>
                    <form:select path="planName">
                        <form:option value="" label="Select plan" />
                        <form:options items="${plan}" />
                    </form:select>
                </td>

                <td>Plan Status:</td>
                <td>
                    <form:select path="Status">
                        <form:option value="" label="Select status" />
                        <form:options items="${status}" />
                    </form:select>
                </td>

                <td>Gender:</td>
                <td>
                    <form:select path="gender">
                        <form:option value="" label="Select gender" />
                        <form:option value="Male" label="Male" />
                        <form:option value="Female" label="Female" />
                    </form:select>
                </td>
            </tr>

            <tr>
                <td colspan="6" class="center">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
