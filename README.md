# serv-bus-sboot-app

Implementing azure service bus (Queues) in spring boot app.  

Create a service bus and a queue inside it.  

Create a **.env** file in resources folder.  

Add these configs into it and update values accordingly.  

```
SB_CON_STRING=""
SB_PRICING_STRING=""
```

Now update the queue name in **HomeController** and **Main app of Receiver project**.  

Sender app will send message when API endpoint is hit.  

![Screenshot 2024-07-24 113927](https://github.com/user-attachments/assets/82a1ed95-1e83-4f9e-bd47-58717a840ff0)


Receiver app will display messages on console.  

![Screenshot 2024-07-24 114137](https://github.com/user-attachments/assets/7bbee195-4711-492f-9c8a-b4807432f544)

