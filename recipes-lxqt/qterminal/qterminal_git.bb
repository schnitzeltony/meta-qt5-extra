SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit lxqt gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget"

SRCREV = "eb6ac8037a071779a357cbe943d969a11497f799"
PV = "0.7.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
