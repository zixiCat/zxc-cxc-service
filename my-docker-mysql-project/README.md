# MySQL Docker Project

This project demonstrates how to set up a MySQL 8 database using Docker Compose. It includes a Docker Compose file to define the MySQL service and an SQL initialization script.

## Project Structure

```
my-docker-mysql-project
├── docker-compose.yml
├── init.sql
└── README.md
```

## Getting Started

### Prerequisites

- Docker
- Docker Compose

### Setup

1. Clone this repository or download the project files.
2. Navigate to the project directory:

   ```
   cd my-docker-mysql-project
   ```

3. Build and run the Docker containers using Docker Compose:

   ```
   docker-compose up
   ```

   This command will pull the MySQL 8 image and start the MySQL service.

### Database Initialization

The `init.sql` file contains SQL commands that will be executed when the MySQL container is initialized. You can modify this file to create tables, insert data, or set up the database schema as needed.

### Accessing the Database

Once the containers are running, you can access the MySQL database using a MySQL client. The default connection parameters are:

- Host: `localhost`
- Port: `3306`
- User: `root`
- Password: `your_password` (replace with the password set in `docker-compose.yml`)

### Stopping the Containers

To stop the running containers, use:

```
docker-compose down
```

This command will stop and remove the containers defined in the `docker-compose.yml` file.

## Additional Information

For more details on Docker and Docker Compose, refer to the official documentation:

- [Docker Documentation](https://docs.docker.com/)
- [Docker Compose Documentation](https://docs.docker.com/compose/)