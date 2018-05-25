SUMMARY = "Translations of LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt"

SRCREV = "91a536e5dec55d0b90ddaa8425d392fe9d7d7d8f"
PV = "0.13.0"

ALLOW_EMPTY_${PN} = "1"
