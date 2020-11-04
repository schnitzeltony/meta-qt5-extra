SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "2954b6bc8b4d0558f3270840b8420b6330439dc2"
PV = "0.16.0"

FILES_${PN} += "${datadir}/polkit-1"

RDEPENDS_${PN} += "lxqt-policykit"
RRECOMMENDS_${PN} += "polkit-group-rule-datetime"
