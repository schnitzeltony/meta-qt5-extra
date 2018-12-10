require ${BPN}.inc

DEPENDS += "${BPN}-native"

PACKAGES =+ "${PN}-bin"

FILES_${PN}-bin = "${bindir}/k*"
