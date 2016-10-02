SUMMARY = "Peg-E is a peg solitaire game"
HOMEPAGE = "http://gottcode.org/peg-e/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "fabd0e3cbd3b06052787ac786b7ac41b"
SRC_URI[sha256sum] = "bf96ad7e84f3244f614ccf08c1dbc4f1bdae4bb2cc362a99ecee322ee7e38635"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/peg-e/icons \
"
