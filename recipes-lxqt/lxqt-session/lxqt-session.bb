SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "procps liblxqt kwindowsystem"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch"
SRCREV = "b50536c6c92f41fefa1ac0e4fd5bf7fbbae2f4c2"
PV = "0.17.1"

FILES_${PN} += " \
    ${datadir}/lxqt/*.conf \
    ${datadir}/xsessions \
    ${datadir}/kdm \
"

RDEPENDS_${PN} += "xdg-user-dirs"
