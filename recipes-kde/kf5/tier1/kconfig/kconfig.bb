require ${BPN}.inc

DEPENDS += "${BPN}-native"

PACKAGES =+ "${PN}-bin"

FILES:${PN}-bin = "${bindir}/k*"
