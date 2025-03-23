import os

env = os.getenv('APP_ENV', 'development')
print(f'Application environment: {env}')
