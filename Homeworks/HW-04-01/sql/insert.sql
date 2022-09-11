CREATE TABLE public.customer
(
    customerid   bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    customername varchar NULL,
    totalcredit  decimal NULL
);
