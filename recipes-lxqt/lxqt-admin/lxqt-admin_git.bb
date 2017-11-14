SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "7c45baad1ffd2a68aef5bce8e9c3f7f07043b878"
PV = "0.12.0"

FILES_${PN} += "${datadir}/polkit-1"

RDEPENDS_${PN} += "lxqt-policykit"
RRECOMMENDS_${PN} += "polkit-group-rule-datetime"
