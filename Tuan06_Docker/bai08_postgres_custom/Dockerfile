# Sử dụng image PostgreSQL phiên bản 15
FROM postgres:15

# Thiết lập biến môi trường cho PostgreSQL
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=password
ENV POSTGRES_DB=postgres

# Sao chép file SQL vào thư mục initdb của PostgreSQL
COPY init.sql /docker-entrypoint-initdb.d/
