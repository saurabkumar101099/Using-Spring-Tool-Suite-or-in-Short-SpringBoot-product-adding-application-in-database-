<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Product Form</title>
    <style>
        .product-form {
            max-width: 400px;
            margin: 0 auto;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form action="addProduct" >
        <div class="form-group">
            <label for="productId">Product ID:</label>
            <input type="text" id="productId" name="productId">
        </div>
        <div class="form-group">
            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName">
        </div>
        <div class="form-group">
            <label for="productPrice">Product Price:</label>
            <input type="text" id="productPrice" name="productPrice">
        </div>
        <input type="submit" value="Add Product">
    </form>
</body>
</html>
