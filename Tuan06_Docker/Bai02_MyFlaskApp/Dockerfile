# Sử dụng image python:3.9 làm base
FROM python:3.9

# Đặt thư mục làm việc
WORKDIR /usr/src/app

# Copy file requirements.txt vào container
COPY requirements.txt ./

# Cài đặt các package cần thiết
RUN pip install -r requirements.txt

# Copy toàn bộ source code vào container
COPY . .

# Expose cổng 5000
EXPOSE 5000

# Khởi chạy ứng dụng Flask
CMD ["python", "app.py"]
