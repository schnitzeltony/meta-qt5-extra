SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "166a42fcbb802a122ca8614871cae98604be061f"
PV = "0.3.0"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

RDEPENDS_${PN} += "compton"

RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"
