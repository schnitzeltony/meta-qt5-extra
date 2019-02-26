SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "3a185198850afa7bc925eeaa46324af6c2c55e0b"
PV = "0.14.1"

FILES_${PN} += "${datadir}/polkit-1"

RDEPENDS_${PN} += "lxqt-policykit"
RRECOMMENDS_${PN} += "polkit-group-rule-datetime"
