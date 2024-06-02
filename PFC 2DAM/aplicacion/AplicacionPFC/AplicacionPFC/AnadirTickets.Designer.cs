namespace AplicacionPFC
{
    partial class AnadirTickets
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            textBox1 = new TextBox();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            label5 = new Label();
            label6 = new Label();
            label7 = new Label();
            textBox2 = new TextBox();
            textBox3 = new TextBox();
            textBox4 = new TextBox();
            textBox5 = new TextBox();
            textBox6 = new TextBox();
            textBox7 = new TextBox();
            button1 = new Button();
            button2 = new Button();
            button3 = new Button();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Location = new Point(386, 53);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 0;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(263, 56);
            label1.Name = "label1";
            label1.Size = new Size(59, 15);
            label1.TabIndex = 1;
            label1.Text = "ID_TICKET";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(102, 105);
            label2.Name = "label2";
            label2.Size = new Size(106, 15);
            label2.TabIndex = 2;
            label2.Text = "NOMBRE COMIDA";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(411, 102);
            label3.Name = "label3";
            label3.Size = new Size(115, 15);
            label3.TabIndex = 3;
            label3.Text = "CANTIDAD COMIDA";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(102, 202);
            label4.Name = "label4";
            label4.Size = new Size(98, 15);
            label4.TabIndex = 4;
            label4.Text = "NOMBRE BEBIDA";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(411, 202);
            label5.Name = "label5";
            label5.Size = new Size(107, 15);
            label5.TabIndex = 5;
            label5.Text = "CANTIDAD BEBIDA";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(102, 309);
            label6.Name = "label6";
            label6.Size = new Size(100, 15);
            label6.TabIndex = 6;
            label6.Text = "NOMBRE POSTRE";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(411, 318);
            label7.Name = "label7";
            label7.Size = new Size(109, 15);
            label7.TabIndex = 7;
            label7.Text = "CANTIDAD POSTRE";
            // 
            // textBox2
            // 
            textBox2.Location = new Point(235, 102);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(100, 23);
            textBox2.TabIndex = 8;
            // 
            // textBox3
            // 
            textBox3.Location = new Point(238, 202);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(100, 23);
            textBox3.TabIndex = 9;
            // 
            // textBox4
            // 
            textBox4.Location = new Point(234, 310);
            textBox4.Name = "textBox4";
            textBox4.Size = new Size(100, 23);
            textBox4.TabIndex = 10;
            // 
            // textBox5
            // 
            textBox5.Location = new Point(565, 99);
            textBox5.Name = "textBox5";
            textBox5.Size = new Size(100, 23);
            textBox5.TabIndex = 11;
            // 
            // textBox6
            // 
            textBox6.Location = new Point(583, 202);
            textBox6.Name = "textBox6";
            textBox6.Size = new Size(100, 23);
            textBox6.TabIndex = 12;
            // 
            // textBox7
            // 
            textBox7.Location = new Point(587, 316);
            textBox7.Name = "textBox7";
            textBox7.Size = new Size(100, 23);
            textBox7.TabIndex = 13;
            // 
            // button1
            // 
            button1.Location = new Point(315, 362);
            button1.Name = "button1";
            button1.Size = new Size(141, 30);
            button1.TabIndex = 14;
            button1.Text = "AÑADIR POSTRE";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(325, 247);
            button2.Name = "button2";
            button2.Size = new Size(141, 30);
            button2.TabIndex = 15;
            button2.Text = "AÑADIR BEBIDA";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Location = new Point(325, 144);
            button3.Name = "button3";
            button3.Size = new Size(141, 30);
            button3.TabIndex = 16;
            button3.Text = "AÑADIR COMIDA";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // AnadirTickets
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(textBox7);
            Controls.Add(textBox6);
            Controls.Add(textBox5);
            Controls.Add(textBox4);
            Controls.Add(textBox3);
            Controls.Add(textBox2);
            Controls.Add(label7);
            Controls.Add(label6);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(textBox1);
            Name = "AnadirTickets";
            Text = "AnadirTickets";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Label label5;
        private Label label6;
        private Label label7;
        private TextBox textBox2;
        private TextBox textBox3;
        private TextBox textBox4;
        private TextBox textBox5;
        private TextBox textBox6;
        private TextBox textBox7;
        private Button button1;
        private Button button2;
        private Button button3;
    }
}