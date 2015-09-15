SUMMARY = "This is a very small helper app for ssh-agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "e353956f5f1153ea4e2c58cc889635c20f2b6c87"
PV = "0.9.0+git${SRCPV}"
