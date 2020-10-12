SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68485d31f72dbb8611179b6c7515617b"

inherit cmake_qt5 python3native

PV = "1.93.0"
SRC_URI = "git://github.com/OpenChemistry/avogadrolibs.git"
SRCREV = "d55b7b2db2314b7c09336c05c841f31bbec40fc4"
S = "${WORKDIR}/git"
