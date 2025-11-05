-- поиск всех клиентов с количествами заказов
SELECT name, count(orders.id) AS orders
FROM customers
         LEFT JOIN orders ON customers.id = orders.customer_id
GROUP BY customers.id
ORDER BY orders DESC;


--поиск некупленных товаров
SELECT p.id, p.product_name, p.price
FROM products p
         LEFT JOIN order_items oi ON p.id = oi.product_id
WHERE oi.product_id IS NULL