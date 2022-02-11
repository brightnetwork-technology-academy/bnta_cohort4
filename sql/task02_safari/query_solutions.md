# Safari Task Query Solutions

## MVP

- The names of the animals in a given enclosure

```sql
SELECT animals.name FROM animals
INNER JOIN enclosures
ON animals.enclosure_id = enclosures.id
WHERE enclosures.id = 1;
```

- The names of the staff working in a given enclosure

```sql
SELECT employees.name FROM employees
INNER JOIN assignments
ON assignments.employee_id = employees.id
WHERE assignments.enclosure_id = 1;
```

## Extensions

- The names of staff working in enclosures which are closed for maintenance

```sql
SELECT DISTINCT employees.name FROM employees
INNER JOIN assignments
ON assignments.employee_id = employees.id
INNER JOIN enclosures
ON enclosures.id = assignments.enclosure_id
WHERE enclosures.closed_for_maintenance IS TRUE;
```

- The name of the enclosure where the oldest animal lives. If there are two animals who are the same age choose the first one alphabetically.

```sql
SELECT enclosures.name FROM animals
INNER JOIN enclosures
ON animals.enclosure_id = enclosures.id
ORDER BY animals.age DESC
LIMIT 1;
```

- The number of different animal types a given keeper has been assigned to work with.

```sql
SELECT COUNT(DISTINCT animals.type) FROM animals
INNER JOIN enclosures
ON animals.enclosure_id = enclosures.id
INNER JOIN assignments
ON assignments.enclosure_id = enclosures.id
WHERE assignments.employee_id = 1;
```

- The number of different keepers who have been assigned to work in a given enclosure

```sql
SELECT COUNT(DISTINCT employees.name) FROM employees
INNER JOIN assignments
ON employees.id = assignments.employee_id
WHERE assignments.enclosure_id = 1;
```

- The names of the other animals sharing an enclosure with a given animal (eg. find the names of all the animals sharing the big cat field with Tony)

```sql
SELECT roommates.name FROM animals
INNER JOIN enclosures
ON animals.enclosure_id = enclosures.id
INNER JOIN animals AS roommates
ON enclosures.id = roommates.enclosure_id
WHERE animals.id = 1;
```