package br.senai.sc.reservaDeAmbientes.util;

public enum UserPrivileges {

    Unprivileged(-1), Normal(0), Master(1), Admin(2);

    UserPrivileges(int i) {}

}
