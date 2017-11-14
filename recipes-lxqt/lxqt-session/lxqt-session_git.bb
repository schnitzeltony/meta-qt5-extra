SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt kwindowsystem"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch"
SRCREV = "206b709cd1cd4a14f454dfa90a908844c11fefee"
PV = "0.12.0"

FILES_${PN} += " \
	${datadir}/xsessions \
	${datadir}/kdm \
"

RDEPENDS_${PN} += "xdg-user-dirs"

RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"
