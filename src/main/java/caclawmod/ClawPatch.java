package caclawmod;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInDiscardAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

@SpirePatch2(
        clz= Claw.class,
        method="use"
)
public class ClawPatch {
    public static void Postfix(Claw __instance) {
        AbstractDungeon.actionManager.addToBottom(new MakeTempCardInDiscardAction(__instance.makeStatEquivalentCopy(), 1));
    }
}
