# Sử dụng Go chính thức làm base image
FROM golang:1.20-alpine

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy file go.mod trước khi copy toàn bộ project
COPY go.mod ./
RUN go mod tidy

# Copy toàn bộ file vào thư mục làm việc
COPY . .

# Build ứng dụng Go
RUN go build -o myapp

# Khai báo cổng ứng dụng chạy
EXPOSE 8080

# Lệnh chạy ứng dụng
CMD ["./myapp"]
