[#ftl]

[@c.page title="Seznam rodičů"]
    <h1>Seznam rodičů</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodice as rodic]
            <tr>
                <td>${rodic.jmeno}</td>
                <td>${rodic.prijmeni}</td>
                <td><a href="/rodic/${rodic.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
