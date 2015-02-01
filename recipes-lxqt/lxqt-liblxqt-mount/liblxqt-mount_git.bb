SUMMARY = "Library used to manage removable devices"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

SRCREV = "1c8422bd78dfb06b631568b1780ec5f59682cbdc"
PV = "0.8.0+git${SRCPV}"

CMAKE_HIDE_ERROR[1] = "lxqtmount, -S${includedir}, -S${STAGING_INCDIR}"
