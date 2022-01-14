import requests, json

api_key ='Your_api_key'

source = input()
  
dest = input()
  
url ='https://maps.googleapis.com/maps/api/distancematrix/json?'
  

r = requests.get(url + 'origins = ' + source +
                   '&destinations = ' + dest +
                   '&key = ' + api_key)

x = r.json()

print(x)