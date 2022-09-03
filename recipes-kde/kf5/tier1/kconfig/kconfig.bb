require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
    qtdeclarative \
"

PACKAGES =+ "${PN}-bin"

FILES:${PN}-bin = "${bindir}/k*"
