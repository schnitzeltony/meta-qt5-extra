SUMMARY = "This is a very small helper app for ssh-agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "c5d9503c6d0439eabebf2610ebbc65211f9acd70"
PV = "0.9.0+git${SRCPV}"
